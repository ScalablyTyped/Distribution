organization := "org.scalablytyped"
name := "browser-sync"
version := "2.27-dt-20230320Z-ca444a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "anymatch" % "3.1.3-0a75c9",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-b89d67",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-7ee530",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20230223Z-63b0bd",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
