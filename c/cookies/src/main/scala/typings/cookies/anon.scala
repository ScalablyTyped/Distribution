package typings.cookies

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.cookies.mod.Cookie
import typings.cookies.mod.CookieAttr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* name */ String, Cookie]
       with Instantiable2[/* name */ String, /* value */ String, Cookie]
       with Instantiable3[
          /* name */ String, 
          (/* value */ String) | (/* value */ Unit), 
          /* attrs */ CookieAttr, 
          Cookie
        ]
}
