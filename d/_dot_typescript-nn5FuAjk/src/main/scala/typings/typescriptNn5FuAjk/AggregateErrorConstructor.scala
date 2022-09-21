package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateErrorConstructor
  extends StObject
     with Instantiable1[/* errors */ Iterable[Any], AggregateError]
     with Instantiable2[/* errors */ Iterable[Any], /* message */ java.lang.String, AggregateError]
     with Instantiable3[
      /* errors */ Iterable[Any], 
      (/* message */ java.lang.String) | (/* message */ Unit), 
      /* options */ ErrorOptions, 
      AggregateError
    ] {
  
  def apply(errors: Iterable[Any]): AggregateError = js.native
  def apply(errors: Iterable[Any], message: java.lang.String): AggregateError = js.native
  def apply(errors: Iterable[Any], message: java.lang.String, options: ErrorOptions): AggregateError = js.native
  def apply(errors: Iterable[Any], message: Unit, options: ErrorOptions): AggregateError = js.native
}
