package typings.awsSdk2Types

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk2Types.clientsDynamodbMod.AttributeMap
import typings.awsSdk2Types.clientsDynamodbMod.AttributeValue
import typings.awsSdk2Types.clientsDynamodbMod.ClientConfiguration
import typings.awsSdk2Types.clientsDynamodbMod.^
import typings.awsSdk2Types.libDynamodbConverterMod.Converter.ConverterOptions
import typings.awsSdk2Types.libDynamodbDocumentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk2Types.libS3ManagedUploadMod.ManagedUpload.ManagedUploadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsAllMod {
  
  @JSImport("aws-sdk2-types/clients/all", "DynamoDB")
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class DynamoDB () extends ^ {
    def this(options: ClientConfiguration) = this()
  }
  object DynamoDB {
    
    @JSImport("aws-sdk2-types/clients/all", "DynamoDB.Converter")
    @js.native
    open class Converter ()
      extends typings.awsSdk2Types.clientsDynamodbMod.Converter
    /* static members */
    object Converter {
      
      @JSImport("aws-sdk2-types/clients/all", "DynamoDB.Converter")
      @js.native
      val ^ : js.Any = js.native
      
      inline def input(data: Any): AttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
      inline def input(data: Any, options: ConverterOptions): AttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
      
      inline def marshall(data: StringDictionary[Any]): AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeMap]
      inline def marshall(data: StringDictionary[Any], options: ConverterOptions): AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeMap]
      
      inline def output(data: AttributeValue): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def output(data: AttributeValue, options: ConverterOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def unmarshall(data: AttributeMap): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    }
    
    @JSImport("aws-sdk2-types/clients/all", "DynamoDB.DocumentClient")
    @js.native
    /**
      * Creates a DynamoDB document client with a set of configuration options.
      */
    open class DocumentClient ()
      extends typings.awsSdk2Types.clientsDynamodbMod.DocumentClient {
      def this(options: DocumentClientOptions & ClientConfiguration) = this()
    }
  }
  
  @JSImport("aws-sdk2-types/clients/all", "RDSDataService")
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class RDSDataService ()
    extends typings.awsSdk2Types.clientsRdsdataserviceMod.^ {
    def this(options: typings.awsSdk2Types.clientsRdsdataserviceMod.ClientConfiguration) = this()
  }
  
  @JSImport("aws-sdk2-types/clients/all", "S3")
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class S3 ()
    extends typings.awsSdk2Types.clientsS3Mod.^ {
    def this(options: typings.awsSdk2Types.clientsS3Mod.ClientConfiguration) = this()
  }
  object S3 {
    
    @JSImport("aws-sdk2-types/clients/all", "S3.ManagedUpload")
    @js.native
    open class ManagedUpload protected ()
      extends typings.awsSdk2Types.clientsS3Mod.ManagedUpload {
      /**
        * Creates a managed upload object with a set of configuration options.
        */
      def this(options: ManagedUploadOptions) = this()
    }
    /* static members */
    object ManagedUpload {
      
      @JSImport("aws-sdk2-types/clients/all", "S3.ManagedUpload")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Default value: 10000
        */
      @JSImport("aws-sdk2-types/clients/all", "S3.ManagedUpload.maxTotalParts")
      @js.native
      def maxTotalParts: Double = js.native
      inline def maxTotalParts_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxTotalParts")(x.asInstanceOf[js.Any])
      
      /**
        * Returns the minimum number of bytes for an individual part upload.
        * Note: Minimum allowed size is 5 MB.
        * 1024 * 5
        */
      @JSImport("aws-sdk2-types/clients/all", "S3.ManagedUpload.minPartSize")
      @js.native
      def minPartSize: Double = js.native
      inline def minPartSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minPartSize")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("aws-sdk2-types/clients/all", "S3.PresignedPost")
    @js.native
    open class PresignedPost ()
      extends typings.awsSdk2Types.clientsS3Mod.PresignedPost
  }
  
  @JSImport("aws-sdk2-types/clients/all", "SES")
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class SES ()
    extends typings.awsSdk2Types.clientsSesMod.^ {
    def this(options: typings.awsSdk2Types.clientsSesMod.ClientConfiguration) = this()
  }
  
  @JSImport("aws-sdk2-types/clients/all", "SQS")
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class SQS ()
    extends typings.awsSdk2Types.clientsSqsMod.^ {
    def this(options: typings.awsSdk2Types.clientsSqsMod.ClientConfiguration) = this()
  }
  
  @JSImport("aws-sdk2-types/clients/all", "SSM")
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class SSM ()
    extends typings.awsSdk2Types.clientsSsmMod.^ {
    def this(options: typings.awsSdk2Types.clientsSsmMod.ClientConfiguration) = this()
  }
}
