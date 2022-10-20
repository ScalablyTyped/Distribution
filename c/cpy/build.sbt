organization := "org.scalablytyped"
name := "cpy"
version := "9.0.1-b33412"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-37df8b",
  "org.scalablytyped" %%% "globby" % "13.1.2-ad4a41",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-e8b1f0",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-a4c5c0",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-93c0bf",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
