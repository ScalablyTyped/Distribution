organization := "org.scalablytyped"
name := "del"
version := "6.0.0-05e572"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-360f6b",
  "org.scalablytyped" %%% "globby" % "11.0.1-9296ef",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-3e7227",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-38a918",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-7c329b",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
