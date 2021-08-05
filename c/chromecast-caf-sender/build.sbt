organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20200121Z-a3ada6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-b33e14",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-fc929d",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-72f439",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-fedcca",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
