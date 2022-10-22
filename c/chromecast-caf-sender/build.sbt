organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20211202Z-f2118d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20221020Z-4b3ce8",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-da3d2e",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-359de2",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-ddd6ba",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
