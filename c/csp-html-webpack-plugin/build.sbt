organization := "org.scalablytyped"
name := "csp-html-webpack-plugin"
version := "3.0-dt-20190926Z-a9ca22"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-3a6b6f",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-2c68e0",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-f0c6ef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
