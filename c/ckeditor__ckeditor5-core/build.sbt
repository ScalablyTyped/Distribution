organization := "org.scalablytyped"
name := "ckeditor__ckeditor5-core"
version := "11.0-dt-20190228Z-d56a5d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-engine" % "11.0-dt-20190228Z-6493dd",
  "org.scalablytyped" %%% "ckeditor__ckeditor5-utils" % "10.2-dt-20190228Z-795c99",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        