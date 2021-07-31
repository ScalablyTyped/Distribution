organization := "org.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20200923Z-3da32f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20201016Z-9c54f2",
  "org.scalablytyped" %%% "mocha" % "8.0-dt-20201111Z-4aff7e",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
