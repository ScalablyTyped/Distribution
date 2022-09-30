organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-f4be09"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-3c44f1",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20220818Z-6826e6",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-65d058",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-fd6dbd",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
