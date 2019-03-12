organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-bbf774"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-17d6b9",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-3996a8",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20190212Z-33893c",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        