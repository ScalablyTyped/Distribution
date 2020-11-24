package typings.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Loader = (js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    js.Promise[typings.cosmiconfig.mod.LoaderResult]
  ]) | typings.cosmiconfig.mod.LoaderSync
  
  type LoaderResult = typings.cosmiconfig.typesMod.Config | scala.Null
  
  type LoaderSync = js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    typings.cosmiconfig.mod.LoaderResult
  ]
  
  type Transform = (js.Function1[
    /* CosmiconfigResult */ typings.cosmiconfig.typesMod.CosmiconfigResult, 
    js.Promise[typings.cosmiconfig.typesMod.CosmiconfigResult]
  ]) | typings.cosmiconfig.mod.TransformSync
  
  type TransformSync = js.Function1[
    /* CosmiconfigResult */ typings.cosmiconfig.typesMod.CosmiconfigResult, 
    typings.cosmiconfig.typesMod.CosmiconfigResult
  ]
}
