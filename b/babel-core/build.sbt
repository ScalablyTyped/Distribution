organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20180910Z-2b4cc3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180910Z-22aba6",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180910Z-44d63d",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180910Z-8a403d",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180910Z-62d351",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181109Z-15048a",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        