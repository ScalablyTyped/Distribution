organization := "org.scalablytyped"
name := "data-urls"
version := "2.0-dt-20201012Z-88dc94"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "webidl-conversions" % "6.1-dt-20200625Z-a5cb9b",
  "org.scalablytyped" %%% "whatwg-mimetype" % "2.1-dt-20200128Z-26815b",
  "org.scalablytyped" %%% "whatwg-url" % "8.0-dt-20200519Z-9fdd5c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
