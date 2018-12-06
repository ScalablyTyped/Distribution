organization := "org.scalablytyped"
name := "chai-jquery"
version := "1.1.1-dt-20181109Z-5fd092"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181027Z-9be48b",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-03d301",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-3181aa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        