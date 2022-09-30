organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20211202Z-398c91"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20211223Z-b256c2",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20211202Z-d8cbc0",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20211202Z-ca22fb",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20211202Z-bdbea4",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20211202Z-bd7732",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
