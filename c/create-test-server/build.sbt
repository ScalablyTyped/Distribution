organization := "org.scalablytyped"
name := "create-test-server"
version := "3.0-dt-20211202Z-c601ca"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20211202Z-6139f1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-5e93f8",
  "org.scalablytyped" %%% "create-cert" % "1.0-dt-20211202Z-d15771",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pem" % "1.9-dt-20211202Z-57714f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
