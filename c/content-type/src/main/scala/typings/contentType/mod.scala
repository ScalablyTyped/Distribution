package typings.contentType

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("content-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(obj: MediaType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parse(input: String): ParsedMediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMediaType]
  @scala.inline
  def parse(input: RequestLike): ParsedMediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMediaType]
  @scala.inline
  def parse(input: ResponseLike): ParsedMediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[ParsedMediaType]
  
  trait MediaType extends StObject {
    
    var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: String
  }
  object MediaType {
    
    @scala.inline
    def apply(`type`: String): MediaType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit class MediaTypeMutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedMediaType extends StObject {
    
    var parameters: StringDictionary[String]
    
    var `type`: String
  }
  object ParsedMediaType {
    
    @scala.inline
    def apply(parameters: StringDictionary[String], `type`: String): ParsedMediaType = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedMediaType]
    }
    
    @scala.inline
    implicit class ParsedMediaTypeMutableBuilder[Self <: ParsedMediaType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestLike extends StObject {
    
    var headers: StringDictionary[js.UndefOr[String | js.Array[String]]]
  }
  object RequestLike {
    
    @scala.inline
    def apply(headers: StringDictionary[js.UndefOr[String | js.Array[String]]]): RequestLike = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestLike]
    }
    
    @scala.inline
    implicit class RequestLikeMutableBuilder[Self <: RequestLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseLike extends StObject {
    
    def getHeader(name: String): js.UndefOr[Double | String | js.Array[String]]
  }
  object ResponseLike {
    
    @scala.inline
    def apply(getHeader: String => js.UndefOr[Double | String | js.Array[String]]): ResponseLike = {
      val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
      __obj.asInstanceOf[ResponseLike]
    }
    
    @scala.inline
    implicit class ResponseLikeMutableBuilder[Self <: ResponseLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetHeader(value: String => js.UndefOr[Double | String | js.Array[String]]): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    }
  }
}
