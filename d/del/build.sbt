organization := "org.scalablytyped"
name := "del"
version := "6.0.0-32b72e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.4-5cfbde",
  "org.scalablytyped" %%% "globby" % "11.0.1-ec0456",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.3-07391b",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.3-0d4703",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.4-140aab",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
