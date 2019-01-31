organization := "org.scalablytyped"
name := "babelify"
version := "v7.3.0-dt-20180611Z-61b850"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20180611Z-856d59",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-67bd73",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-cedfd5",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-b9c4a4",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-4611da",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-308d4a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        