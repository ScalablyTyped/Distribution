package typings.conventionalChangelogPresetLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Builder = js.Function1[
    /* config */ js.Object with typings.conventionalChangelogPresetLoader.mod.Config, 
    typings.conventionalChangelogCore.mod.Options.Config[
      typings.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol], 
      typings.conventionalChangelogWriter.mod.Context
    ]
  ]
}
