package typings.cryptoJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CipherParams = typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams
  
  type HasherHelper = js.Function2[
    /* message */ typings.cryptoJs.mod.WordArray | java.lang.String, 
    /* cfg */ js.UndefOr[js.Object], 
    typings.cryptoJs.mod.WordArray
  ]
  
  type HmacHasherHelper = js.Function2[
    /* message */ typings.cryptoJs.mod.WordArray | java.lang.String, 
    /* key */ typings.cryptoJs.mod.WordArray | java.lang.String, 
    typings.cryptoJs.mod.WordArray
  ]
  
  type WordArray = typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
  
  type X64Word = typings.cryptoJs.mod.global.CryptoJS.x64.Word
}
