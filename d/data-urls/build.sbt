organization := "org.scalablytyped"
name := "data-urls"
version := "2.0-dt-20201012Z-e6270f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "webidl-conversions" % "6.1-dt-20200625Z-580e55",
  "org.scalablytyped" %%% "whatwg-mimetype" % "2.1-dt-20200128Z-849714",
  "org.scalablytyped" %%% "whatwg-url" % "8.0-dt-20200519Z-4d1737")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
