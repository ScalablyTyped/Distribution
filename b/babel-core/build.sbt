organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-5f4950"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-5df629",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-3697ff",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-e17a99",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-7ad93b",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-010229",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        