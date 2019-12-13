organization := "org.scalablytyped"
name := "blueprintjs__datetime"
version := "3.15.1-368c3c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.22.2-f11c86",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.12.0-b1d7b6",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-a9bf73",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-day-picker" % "7.4.0-5bada1",
  "org.scalablytyped" %%% "react-popper" % "1.3.7-273953",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        