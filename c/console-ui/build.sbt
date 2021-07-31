organization := "org.scalablytyped"
name := "console-ui"
version := "2.2-dt-20190926Z-b45b0a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "inquirer" % "7.3-dt-20200820Z-be1eb2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "rxjs" % "6.6.3-39dd20",
  "org.scalablytyped" %%% "rxjs-compat" % "6.6.3-8b121f",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20201002Z-b7264d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
