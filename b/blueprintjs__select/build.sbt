organization := "org.scalablytyped"
name := "blueprintjs__select"
version := "3.9.0-fe5742"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.17.1-bf5eb9",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.9.1-6bed11",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-b6ccee",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        