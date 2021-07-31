package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectQueryBuilder[T]
  extends StObject
     with QueryBuilder
     with WhereableQueryBuilder[T]
     with LimitableQueryBuilder
     with FromableQueryBuilder
