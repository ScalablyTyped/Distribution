organization := "org.scalablytyped"
name := "cpy"
version := "9.0.1-27010f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-cf99dc",
  "org.scalablytyped" %%% "globby" % "13.1.2-635aa6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-1f2587",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-1b2491",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-ae633b",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
