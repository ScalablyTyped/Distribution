organization := "org.scalablytyped"
name := "chrome-apps"
version := "0.0-unknown-dt-20200923Z-920a34"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-eba870",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-ccfe6c",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
