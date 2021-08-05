organization := "org.scalablytyped"
name := "builder-util"
version := "22.9.1-25e095"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.7.2-4a95d9",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-64e7b3",
  "org.scalablytyped" %%% "fs-extra" % "9.0-dt-20201111Z-fb7961",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "temp-file" % "3.3.7-bd12b9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
