organization := "org.scalablytyped"
name := "blueprintjs__datetime"
version := "3.12.0-e59365"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.18.0-befef2",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.10.0-6ba2d7",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-a949a4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-day-picker" % "7.3.2-223443",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        