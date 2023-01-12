package typings.baseui.anon

import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly ASC :'ASC',  readonly DESC :'DESC'}> */
trait ReadonlyreadonlyASCASCrea extends StObject {
  
  val ASC: typings.baseui.baseuiStrings.ASC
  
  val DESC: typings.baseui.baseuiStrings.DESC
}
object ReadonlyreadonlyASCASCrea {
  
  inline def apply(): ReadonlyreadonlyASCASCrea = {
    val __obj = js.Dynamic.literal(ASC = "ASC", DESC = "DESC")
    __obj.asInstanceOf[ReadonlyreadonlyASCASCrea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyreadonlyASCASCrea] (val x: Self) extends AnyVal {
    
    inline def setASC(value: ASC): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
    
    inline def setDESC(value: DESC): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
  }
}
