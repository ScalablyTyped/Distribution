package typings.consul.mod

import typings.consul.mod.Acl.CloneOptions
import typings.consul.mod.Acl.CreateOptions
import typings.consul.mod.Acl.DestroyOptions
import typings.consul.mod.Acl.GetOptions
import typings.consul.mod.Acl.InfoOptions
import typings.consul.mod.Acl.ListOptions
import typings.consul.mod.Acl.UpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Acl extends StObject {
  
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: String): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: CloneOptions): Thenable[TData] = js.native
  /**
    * Creates a new token by cloning an existing token
    */
  def clone[TData](opts: CloneOptions, callback: Callback[TData]): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Creates a new token with policy
    */
  def create[TData](): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](callback: Callback[TData]): Unit = js.native
  def create[TData](opts: CreateOptions): Thenable[TData] = js.native
  /**
    * Creates a new token with policy
    */
  def create[TData](opts: CreateOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Destroys a given token
    */
  def destroy[TData](id: String): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: DestroyOptions): Thenable[TData] = js.native
  /**
    * Destroys a given token
    */
  def destroy[TData](opts: DestroyOptions, callback: Callback[TData]): Unit = js.native
  
  def get[TData](id: String): Thenable[TData] = js.native
  def get[TData](id: String, callback: Callback[TData]): Unit = js.native
  def get[TData](opts: GetOptions): Thenable[TData] = js.native
  def get[TData](opts: GetOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: String): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](id: String, callback: Callback[TData]): Unit = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: InfoOptions): Thenable[TData] = js.native
  /**
    * Queries the policy of a given token
    */
  def info[TData](opts: InfoOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Lists all the active tokens
    */
  def list[TData](): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](callback: Callback[TData]): Unit = js.native
  def list[TData](opts: ListOptions): Thenable[TData] = js.native
  /**
    * Lists all the active tokens
    */
  def list[TData](opts: ListOptions, callback: Callback[TData]): Unit = js.native
  
  /**
    * Update the policy of a token
    */
  def update[TData](opts: UpdateOptions): Thenable[TData] = js.native
  /**
    * Update the policy of a token
    */
  def update[TData](opts: UpdateOptions, callback: Callback[TData]): Unit = js.native
}
object Acl {
  
  @js.native
  trait CloneOptions extends CommonOptions {
    
    var id: String = js.native
  }
  object CloneOptions {
    
    @scala.inline
    def apply(id: String): CloneOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneOptions]
    }
    
    @scala.inline
    implicit class CloneOptionsMutableBuilder[Self <: CloneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateOptions extends CommonOptions {
    
    var name: js.UndefOr[String] = js.native
    
    var rules: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateOptions {
    
    @scala.inline
    def apply(): CreateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptions]
    }
    
    @scala.inline
    implicit class CreateOptionsMutableBuilder[Self <: CreateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyOptions extends CommonOptions {
    
    var id: String = js.native
  }
  object DestroyOptions {
    
    @scala.inline
    def apply(id: String): DestroyOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestroyOptions]
    }
    
    @scala.inline
    implicit class DestroyOptionsMutableBuilder[Self <: DestroyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type GetOptions = InfoOptions
  
  @js.native
  trait InfoOptions extends CommonOptions {
    
    var id: String = js.native
  }
  object InfoOptions {
    
    @scala.inline
    def apply(id: String): InfoOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoOptions]
    }
    
    @scala.inline
    implicit class InfoOptionsMutableBuilder[Self <: InfoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type ListOptions = CommonOptions
  
  @js.native
  trait UpdateOptions extends CommonOptions {
    
    var id: String = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var rules: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object UpdateOptions {
    
    @scala.inline
    def apply(id: String): UpdateOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateOptions]
    }
    
    @scala.inline
    implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
