organization := "org.scalablytyped"
name := "broccoli-persistent-filter"
version := "3.1.3-66dad5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "broccoli-node-api" % "1.7.0-ca2fdd",
  "org.scalablytyped" %%% "broccoli-output-wrapper" % "3.2.5-6b9da0",
  "org.scalablytyped" %%% "broccoli-plugin" % "4.0.7-303def",
  "org.scalablytyped" %%% "fs-merger" % "3.2.1-8e03d8",
  "org.scalablytyped" %%% "fs-tree-diff" % "2.0.1-d03b3a",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-374fcc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "walk-sync" % "3.0.0-729755")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
