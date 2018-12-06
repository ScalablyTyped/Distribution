organization := "org.scalablytyped"
name := "bootstrap"
version := "4.1-dt-20181206Z-642589"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-03d301",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-8df7a3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-3181aa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        