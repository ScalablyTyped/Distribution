organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-435f1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-d034ae",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-ec95f0",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-a08b24",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        