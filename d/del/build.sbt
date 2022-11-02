organization := "org.scalablytyped"
name := "del"
version := "7.0.0-1dd6d6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "fast-glob" % "3.2.12-3ca05d",
  "org.scalablytyped" %%% "globby" % "13.1.2-dc596d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.5-3163b4",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.5-4ce761",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.8-574007",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
