organization := "org.scalablytyped"
name := "chrome-apps"
version := "0.0-unknown-dt-20220818Z-e45dfa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-668aac",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-5561bf",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
