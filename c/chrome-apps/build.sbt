organization := "org.scalablytyped"
name := "chrome-apps"
version := "0.0-unknown-dt-20230525Z-66c058"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-4bd552",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-795c7d",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
