package typings.counterpart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LocaleChangeHandler = js.Function2[/* newLocale */ java.lang.String, /* oldLocale */ java.lang.String, scala.Unit]
  
  type NotFoundHandler = js.Function4[
    /* locale */ java.lang.String, 
    /* key */ java.lang.String, 
    /* fallback */ java.lang.String, 
    /* scope */ java.lang.String, 
    scala.Unit
  ]
}
