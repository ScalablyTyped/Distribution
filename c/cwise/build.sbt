organization := "com.scalablytyped"
name := "cwise"
version := "1.0-dt-20180910Z-dc2521"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180910Z-593109",
  "com.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180910Z-da344d",
  "com.scalablytyped" %%% "ndarray" % "1.0-dt-20180910Z-518d39",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        