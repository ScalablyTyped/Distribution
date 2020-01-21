package typings.conventionalRecommendedBump.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Options {
  type WhatBump = js.Function1[
    /* commits */ js.Array[
      typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol]
    ], 
    typings.conventionalRecommendedBump.mod.Options.WhatBump.Result
  ]
}
