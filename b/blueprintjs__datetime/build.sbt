organization := "org.scalablytyped"
name := "blueprintjs__datetime"
version := "3.12.0-bd1e60"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.18.0-a7718e",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.10.0-41bbbc",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-5e90d9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-53b9fb",
  "org.scalablytyped" %%% "react-day-picker" % "7.3.2-0ada12",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        