package typings.cassanknex.mod

import typings.cassanknex.cassanknexStrings.asc
import typings.cassanknex.cassanknexStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateableColumnFamilyBuilder[T] extends StObject {
  
  def withCaching(): this.type
  
  def withClusteringOrderBy[K /* <: /* keyof T */ String */](value: K, direction: desc | asc): this.type
  
  def withCompaction(): this.type
  
  def withCompression(): this.type
}
object CreateableColumnFamilyBuilder {
  
  inline def apply[T](
    withCaching: () => CreateableColumnFamilyBuilder[T],
    withClusteringOrderBy: (Any, desc | asc) => CreateableColumnFamilyBuilder[T],
    withCompaction: () => CreateableColumnFamilyBuilder[T],
    withCompression: () => CreateableColumnFamilyBuilder[T]
  ): CreateableColumnFamilyBuilder[T] = {
    val __obj = js.Dynamic.literal(withCaching = js.Any.fromFunction0(withCaching), withClusteringOrderBy = js.Any.fromFunction2(withClusteringOrderBy), withCompaction = js.Any.fromFunction0(withCompaction), withCompression = js.Any.fromFunction0(withCompression))
    __obj.asInstanceOf[CreateableColumnFamilyBuilder[T]]
  }
  
  extension [Self <: CreateableColumnFamilyBuilder[?], T](x: Self & CreateableColumnFamilyBuilder[T]) {
    
    inline def setWithCaching(value: () => CreateableColumnFamilyBuilder[T]): Self = StObject.set(x, "withCaching", js.Any.fromFunction0(value))
    
    inline def setWithClusteringOrderBy(value: (Any, desc | asc) => CreateableColumnFamilyBuilder[T]): Self = StObject.set(x, "withClusteringOrderBy", js.Any.fromFunction2(value))
    
    inline def setWithCompaction(value: () => CreateableColumnFamilyBuilder[T]): Self = StObject.set(x, "withCompaction", js.Any.fromFunction0(value))
    
    inline def setWithCompression(value: () => CreateableColumnFamilyBuilder[T]): Self = StObject.set(x, "withCompression", js.Any.fromFunction0(value))
  }
}
