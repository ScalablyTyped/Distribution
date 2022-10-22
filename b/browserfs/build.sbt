organization := "org.scalablytyped"
name := "browserfs"
version := "1.4.3-6e626a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buffer" % "6.0.3-6a53bb",
  "org.scalablytyped" %%% "dropboxjs" % "0.0-unknown-dt-20220818Z-bc25ff",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-da3d2e",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-359de2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
