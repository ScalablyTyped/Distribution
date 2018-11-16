organization := "com.scalablytyped"
name := "cwise"
version := "1.0-dt-20181102Z-389cb8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20181102Z-5332f2",
  "com.scalablytyped" %%% "cwise-parser" % "1.0-dt-20181102Z-8c0427",
  "com.scalablytyped" %%% "ndarray" % "1.0-dt-20181102Z-1a36b1",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        