package typings.deta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesBaseRequestMod {
  
  trait FetchOptions extends StObject {
    
    var last: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object FetchOptions {
    
    inline def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait InsertOptions extends StObject {
    
    var expireAt: js.UndefOr[js.Date | Double] = js.undefined
    
    var expireIn: js.UndefOr[Double] = js.undefined
  }
  object InsertOptions {
    
    inline def apply(): InsertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InsertOptions] (val x: Self) extends AnyVal {
      
      inline def setExpireAt(value: js.Date | Double): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      inline def setExpireAtUndefined: Self = StObject.set(x, "expireAt", js.undefined)
      
      inline def setExpireIn(value: Double): Self = StObject.set(x, "expireIn", value.asInstanceOf[js.Any])
      
      inline def setExpireInUndefined: Self = StObject.set(x, "expireIn", js.undefined)
    }
  }
  
  trait PutManyOptions extends StObject {
    
    var expireAt: js.UndefOr[js.Date | Double] = js.undefined
    
    var expireIn: js.UndefOr[Double] = js.undefined
  }
  object PutManyOptions {
    
    inline def apply(): PutManyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutManyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutManyOptions] (val x: Self) extends AnyVal {
      
      inline def setExpireAt(value: js.Date | Double): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      inline def setExpireAtUndefined: Self = StObject.set(x, "expireAt", js.undefined)
      
      inline def setExpireIn(value: Double): Self = StObject.set(x, "expireIn", value.asInstanceOf[js.Any])
      
      inline def setExpireInUndefined: Self = StObject.set(x, "expireIn", js.undefined)
    }
  }
  
  trait PutOptions extends StObject {
    
    var expireAt: js.UndefOr[js.Date | Double] = js.undefined
    
    var expireIn: js.UndefOr[Double] = js.undefined
  }
  object PutOptions {
    
    inline def apply(): PutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PutOptions] (val x: Self) extends AnyVal {
      
      inline def setExpireAt(value: js.Date | Double): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      inline def setExpireAtUndefined: Self = StObject.set(x, "expireAt", js.undefined)
      
      inline def setExpireIn(value: Double): Self = StObject.set(x, "expireIn", value.asInstanceOf[js.Any])
      
      inline def setExpireInUndefined: Self = StObject.set(x, "expireIn", js.undefined)
    }
  }
  
  trait UpdateOptions extends StObject {
    
    var expireAt: js.UndefOr[js.Date | Double] = js.undefined
    
    var expireIn: js.UndefOr[Double] = js.undefined
  }
  object UpdateOptions {
    
    inline def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      inline def setExpireAt(value: js.Date | Double): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      inline def setExpireAtUndefined: Self = StObject.set(x, "expireAt", js.undefined)
      
      inline def setExpireIn(value: Double): Self = StObject.set(x, "expireIn", value.asInstanceOf[js.Any])
      
      inline def setExpireInUndefined: Self = StObject.set(x, "expireIn", js.undefined)
    }
  }
}
