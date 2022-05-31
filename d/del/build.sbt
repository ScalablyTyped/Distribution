organization := "org.scalablytyped"
name := "del"
version := "6.0.0-84870d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-6e50c7",
  "org.scalablytyped" %%% "globby" % "11.0.1-8593b0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-c66984",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-ea5389",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-eab1ac",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
