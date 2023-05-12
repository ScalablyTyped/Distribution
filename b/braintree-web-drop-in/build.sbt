organization := "org.scalablytyped"
name := "braintree-web-drop-in"
version := "1.34-dt-20230428Z-096f15"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "applepayjs" % "14.0-dt-20230405Z-db8426",
  "org.scalablytyped" %%% "braintree-web" % "3.75-dt-20230316Z-108c47",
  "org.scalablytyped" %%% "googlepay" % "0.7-dt-20230225Z-c5c35c",
  "org.scalablytyped" %%% "paypal-checkout-components" % "4.0-dt-20230214Z-c58328",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
