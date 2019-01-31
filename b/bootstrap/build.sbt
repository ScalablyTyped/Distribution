organization := "org.scalablytyped"
name := "bootstrap"
version := "4.2-dt-20190124Z-a01f03"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-4c60fb",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.7-1467eb",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-94c7e4",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        