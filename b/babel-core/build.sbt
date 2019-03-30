organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-a871f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-8b9a32",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-745136",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-ddaf22",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190218Z-8f048c",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-152e86",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        