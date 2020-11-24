package typings.cashDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Comparator = java.lang.String | typings.cashDom.mod.Ele | typings.cashDom.mod.Cash | (js.ThisFunction2[
    /* this */ typings.cashDom.mod.EleLoose, 
    /* index */ scala.Double, 
    /* ele */ typings.cashDom.mod.EleLoose, 
    scala.Boolean
  ])
  
  type Context = typings.std.Document | typings.std.HTMLElement | typings.std.Element
  
  type EachArrayCallback[T] = js.ThisFunction2[/* this */ T, /* index */ scala.Double, /* ele */ T, js.Any]
  
  type EachObjectCallback[T] = js.ThisFunction2[/* this */ T, /* key */ java.lang.String, /* value */ T, js.Any]
  
  type Ele = typings.std.Window | typings.std.Document | typings.std.HTMLElement | typings.std.Element | typings.std.Node
  
  type EleLoose = typings.std.HTMLElement with typings.std.Element with typings.std.Node
  
  type MapCallback[T] = js.ThisFunction2[/* this */ T, /* index */ scala.Double, /* ele */ T, typings.cashDom.mod.Ele]
  
  type PlainObject[T] = typings.std.Record[java.lang.String, T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cashDom.mod.falsy
    - java.lang.String
    - js.Function
    - typings.std.HTMLCollection
    - typings.std.NodeList
    - typings.cashDom.mod.Ele
    - js.Array[typings.cashDom.mod.Ele]
    - typings.std.ArrayLike[typings.cashDom.mod.Ele]
    - typings.cashDom.mod.Cash
  */
  type Selector = js.UndefOr[
    typings.cashDom.mod._Selector | js.Array[typings.cashDom.mod.Ele] | typings.std.ArrayLike[typings.cashDom.mod.Ele] | java.lang.String | js.Function | typings.std.HTMLCollection | typings.std.NodeList | typings.cashDom.mod.Ele | scala.Null
  ]
  
  /* Rewritten from type alias, can be one of: 
    - js.UndefOr[scala.Nothing]
    - scala.Null
    - typings.cashDom.cashDomBooleans.`false`
    - typings.cashDom.cashDomNumbers.`0`
    - typings.cashDom.cashDomStrings._empty
  */
  type falsy = js.UndefOr[typings.cashDom.mod._falsy | scala.Null]
}
