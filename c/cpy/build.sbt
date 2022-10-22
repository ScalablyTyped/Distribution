organization := "org.scalablytyped"
name := "cpy"
version := "9.0.1-ae1b9b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-2f169f",
  "org.scalablytyped" %%% "globby" % "13.1.2-d2baa4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-2ae60c",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-71dac8",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-bf4c40",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
