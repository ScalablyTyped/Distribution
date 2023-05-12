package typings.awsSdk.clientsTnbMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tnb extends Service {
  
  /**
    * Cancels a network operation. A network operation is any operation that is done to your network, such as network instance instantiation or termination.
    */
  def cancelSolNetworkOperation(): Request[js.Object, AWSError] = js.native
  def cancelSolNetworkOperation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Cancels a network operation. A network operation is any operation that is done to your network, such as network instance instantiation or termination.
    */
  def cancelSolNetworkOperation(params: CancelSolNetworkOperationInput): Request[js.Object, AWSError] = js.native
  def cancelSolNetworkOperation(
    params: CancelSolNetworkOperationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_Tnb: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network. For more information, see Function packages in the Amazon Web Services Telco Network Builder User Guide.  Creating a function package is the first step for creating a network in AWS TNB. This request creates an empty container with an ID. The next step is to upload the actual CSAR zip file into that empty container. To upload function package content, see PutSolFunctionPackageContent.
    */
  def createSolFunctionPackage(): Request[CreateSolFunctionPackageOutput, AWSError] = js.native
  def createSolFunctionPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreateSolFunctionPackageOutput, Unit]): Request[CreateSolFunctionPackageOutput, AWSError] = js.native
  /**
    * Creates a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network. For more information, see Function packages in the Amazon Web Services Telco Network Builder User Guide.  Creating a function package is the first step for creating a network in AWS TNB. This request creates an empty container with an ID. The next step is to upload the actual CSAR zip file into that empty container. To upload function package content, see PutSolFunctionPackageContent.
    */
  def createSolFunctionPackage(params: CreateSolFunctionPackageInput): Request[CreateSolFunctionPackageOutput, AWSError] = js.native
  def createSolFunctionPackage(
    params: CreateSolFunctionPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSolFunctionPackageOutput, Unit]
  ): Request[CreateSolFunctionPackageOutput, AWSError] = js.native
  
  /**
    * Creates a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. Creating a network instance is the third step after creating a network package. For more information about network instances, Network instances in the Amazon Web Services Telco Network Builder User Guide. Once you create a network instance, you can instantiate it. To instantiate a network, see InstantiateSolNetworkInstance.
    */
  def createSolNetworkInstance(): Request[CreateSolNetworkInstanceOutput, AWSError] = js.native
  def createSolNetworkInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateSolNetworkInstanceOutput, Unit]): Request[CreateSolNetworkInstanceOutput, AWSError] = js.native
  /**
    * Creates a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. Creating a network instance is the third step after creating a network package. For more information about network instances, Network instances in the Amazon Web Services Telco Network Builder User Guide. Once you create a network instance, you can instantiate it. To instantiate a network, see InstantiateSolNetworkInstance.
    */
  def createSolNetworkInstance(params: CreateSolNetworkInstanceInput): Request[CreateSolNetworkInstanceOutput, AWSError] = js.native
  def createSolNetworkInstance(
    params: CreateSolNetworkInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSolNetworkInstanceOutput, Unit]
  ): Request[CreateSolNetworkInstanceOutput, AWSError] = js.native
  
  /**
    * Creates a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on. For more information, see Network instances in the Amazon Web Services Telco Network Builder User Guide.  A network package consists of a network service descriptor (NSD) file (required) and any additional files (optional), such as scripts specific to your needs. For example, if you have multiple function packages in your network package, you can use the NSD to define which network functions should run in certain VPCs, subnets, or EKS clusters. This request creates an empty network package container with an ID. Once you create a network package, you can upload the network package content using PutSolNetworkPackageContent.
    */
  def createSolNetworkPackage(): Request[CreateSolNetworkPackageOutput, AWSError] = js.native
  def createSolNetworkPackage(callback: js.Function2[/* err */ AWSError, /* data */ CreateSolNetworkPackageOutput, Unit]): Request[CreateSolNetworkPackageOutput, AWSError] = js.native
  /**
    * Creates a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on. For more information, see Network instances in the Amazon Web Services Telco Network Builder User Guide.  A network package consists of a network service descriptor (NSD) file (required) and any additional files (optional), such as scripts specific to your needs. For example, if you have multiple function packages in your network package, you can use the NSD to define which network functions should run in certain VPCs, subnets, or EKS clusters. This request creates an empty network package container with an ID. Once you create a network package, you can upload the network package content using PutSolNetworkPackageContent.
    */
  def createSolNetworkPackage(params: CreateSolNetworkPackageInput): Request[CreateSolNetworkPackageOutput, AWSError] = js.native
  def createSolNetworkPackage(
    params: CreateSolNetworkPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSolNetworkPackageOutput, Unit]
  ): Request[CreateSolNetworkPackageOutput, AWSError] = js.native
  
  /**
    * Deletes a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network. To delete a function package, the package must be in a disabled state. To disable a function package, see UpdateSolFunctionPackage. 
    */
  def deleteSolFunctionPackage(): Request[js.Object, AWSError] = js.native
  def deleteSolFunctionPackage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network. To delete a function package, the package must be in a disabled state. To disable a function package, see UpdateSolFunctionPackage. 
    */
  def deleteSolFunctionPackage(params: DeleteSolFunctionPackageInput): Request[js.Object, AWSError] = js.native
  def deleteSolFunctionPackage(
    params: DeleteSolFunctionPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. To delete a network instance, the instance must be in a stopped or terminated state. To terminate a network instance, see TerminateSolNetworkInstance.
    */
  def deleteSolNetworkInstance(): Request[js.Object, AWSError] = js.native
  def deleteSolNetworkInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. To delete a network instance, the instance must be in a stopped or terminated state. To terminate a network instance, see TerminateSolNetworkInstance.
    */
  def deleteSolNetworkInstance(params: DeleteSolNetworkInstanceInput): Request[js.Object, AWSError] = js.native
  def deleteSolNetworkInstance(
    params: DeleteSolNetworkInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on. To delete a network package, the package must be in a disable state. To disable a network package, see UpdateSolNetworkPackage.
    */
  def deleteSolNetworkPackage(): Request[js.Object, AWSError] = js.native
  def deleteSolNetworkPackage(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on. To delete a network package, the package must be in a disable state. To disable a network package, see UpdateSolNetworkPackage.
    */
  def deleteSolNetworkPackage(params: DeleteSolNetworkPackageInput): Request[js.Object, AWSError] = js.native
  def deleteSolNetworkPackage(
    params: DeleteSolNetworkPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets the details of a network function instance, including the instantation state and metadata from the function package descriptor in the network function package. A network function instance is a function in a function package .
    */
  def getSolFunctionInstance(): Request[GetSolFunctionInstanceOutput, AWSError] = js.native
  def getSolFunctionInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionInstanceOutput, Unit]): Request[GetSolFunctionInstanceOutput, AWSError] = js.native
  /**
    * Gets the details of a network function instance, including the instantation state and metadata from the function package descriptor in the network function package. A network function instance is a function in a function package .
    */
  def getSolFunctionInstance(params: GetSolFunctionInstanceInput): Request[GetSolFunctionInstanceOutput, AWSError] = js.native
  def getSolFunctionInstance(
    params: GetSolFunctionInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionInstanceOutput, Unit]
  ): Request[GetSolFunctionInstanceOutput, AWSError] = js.native
  
  /**
    * Gets the details of an individual function package, such as the operational state and whether the package is in use. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network..
    */
  def getSolFunctionPackage(): Request[GetSolFunctionPackageOutput, AWSError] = js.native
  def getSolFunctionPackage(callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionPackageOutput, Unit]): Request[GetSolFunctionPackageOutput, AWSError] = js.native
  /**
    * Gets the details of an individual function package, such as the operational state and whether the package is in use. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network..
    */
  def getSolFunctionPackage(params: GetSolFunctionPackageInput): Request[GetSolFunctionPackageOutput, AWSError] = js.native
  def getSolFunctionPackage(
    params: GetSolFunctionPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionPackageOutput, Unit]
  ): Request[GetSolFunctionPackageOutput, AWSError] = js.native
  
  /**
    * Gets the contents of a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def getSolFunctionPackageContent(): Request[GetSolFunctionPackageContentOutput, AWSError] = js.native
  def getSolFunctionPackageContent(callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionPackageContentOutput, Unit]): Request[GetSolFunctionPackageContentOutput, AWSError] = js.native
  /**
    * Gets the contents of a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def getSolFunctionPackageContent(params: GetSolFunctionPackageContentInput): Request[GetSolFunctionPackageContentOutput, AWSError] = js.native
  def getSolFunctionPackageContent(
    params: GetSolFunctionPackageContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionPackageContentOutput, Unit]
  ): Request[GetSolFunctionPackageContentOutput, AWSError] = js.native
  
  /**
    * Gets a function package descriptor in a function package. A function package descriptor is a .yaml file in a function package that uses the TOSCA standard to describe how the network function in the function package should run on your network. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def getSolFunctionPackageDescriptor(): Request[GetSolFunctionPackageDescriptorOutput, AWSError] = js.native
  def getSolFunctionPackageDescriptor(callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionPackageDescriptorOutput, Unit]): Request[GetSolFunctionPackageDescriptorOutput, AWSError] = js.native
  /**
    * Gets a function package descriptor in a function package. A function package descriptor is a .yaml file in a function package that uses the TOSCA standard to describe how the network function in the function package should run on your network. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def getSolFunctionPackageDescriptor(params: GetSolFunctionPackageDescriptorInput): Request[GetSolFunctionPackageDescriptorOutput, AWSError] = js.native
  def getSolFunctionPackageDescriptor(
    params: GetSolFunctionPackageDescriptorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolFunctionPackageDescriptorOutput, Unit]
  ): Request[GetSolFunctionPackageDescriptorOutput, AWSError] = js.native
  
  /**
    * Gets the details of the network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed.
    */
  def getSolNetworkInstance(): Request[GetSolNetworkInstanceOutput, AWSError] = js.native
  def getSolNetworkInstance(callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkInstanceOutput, Unit]): Request[GetSolNetworkInstanceOutput, AWSError] = js.native
  /**
    * Gets the details of the network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed.
    */
  def getSolNetworkInstance(params: GetSolNetworkInstanceInput): Request[GetSolNetworkInstanceOutput, AWSError] = js.native
  def getSolNetworkInstance(
    params: GetSolNetworkInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkInstanceOutput, Unit]
  ): Request[GetSolNetworkInstanceOutput, AWSError] = js.native
  
  /**
    * Gets the details of a network operation, including the tasks involved in the network operation and the status of the tasks. A network operation is any operation that is done to your network, such as network instance instantiation or termination.
    */
  def getSolNetworkOperation(): Request[GetSolNetworkOperationOutput, AWSError] = js.native
  def getSolNetworkOperation(callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkOperationOutput, Unit]): Request[GetSolNetworkOperationOutput, AWSError] = js.native
  /**
    * Gets the details of a network operation, including the tasks involved in the network operation and the status of the tasks. A network operation is any operation that is done to your network, such as network instance instantiation or termination.
    */
  def getSolNetworkOperation(params: GetSolNetworkOperationInput): Request[GetSolNetworkOperationOutput, AWSError] = js.native
  def getSolNetworkOperation(
    params: GetSolNetworkOperationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkOperationOutput, Unit]
  ): Request[GetSolNetworkOperationOutput, AWSError] = js.native
  
  /**
    * Gets the details of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def getSolNetworkPackage(): Request[GetSolNetworkPackageOutput, AWSError] = js.native
  def getSolNetworkPackage(callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkPackageOutput, Unit]): Request[GetSolNetworkPackageOutput, AWSError] = js.native
  /**
    * Gets the details of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def getSolNetworkPackage(params: GetSolNetworkPackageInput): Request[GetSolNetworkPackageOutput, AWSError] = js.native
  def getSolNetworkPackage(
    params: GetSolNetworkPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkPackageOutput, Unit]
  ): Request[GetSolNetworkPackageOutput, AWSError] = js.native
  
  /**
    * Gets the contents of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def getSolNetworkPackageContent(): Request[GetSolNetworkPackageContentOutput, AWSError] = js.native
  def getSolNetworkPackageContent(callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkPackageContentOutput, Unit]): Request[GetSolNetworkPackageContentOutput, AWSError] = js.native
  /**
    * Gets the contents of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def getSolNetworkPackageContent(params: GetSolNetworkPackageContentInput): Request[GetSolNetworkPackageContentOutput, AWSError] = js.native
  def getSolNetworkPackageContent(
    params: GetSolNetworkPackageContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkPackageContentOutput, Unit]
  ): Request[GetSolNetworkPackageContentOutput, AWSError] = js.native
  
  /**
    * Gets the content of the network service descriptor. A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network functions on.
    */
  def getSolNetworkPackageDescriptor(): Request[GetSolNetworkPackageDescriptorOutput, AWSError] = js.native
  def getSolNetworkPackageDescriptor(callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkPackageDescriptorOutput, Unit]): Request[GetSolNetworkPackageDescriptorOutput, AWSError] = js.native
  /**
    * Gets the content of the network service descriptor. A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network functions on.
    */
  def getSolNetworkPackageDescriptor(params: GetSolNetworkPackageDescriptorInput): Request[GetSolNetworkPackageDescriptorOutput, AWSError] = js.native
  def getSolNetworkPackageDescriptor(
    params: GetSolNetworkPackageDescriptorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolNetworkPackageDescriptorOutput, Unit]
  ): Request[GetSolNetworkPackageDescriptorOutput, AWSError] = js.native
  
  /**
    * Instantiates a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. Before you can instantiate a network instance, you have to create a network instance. For more information, see CreateSolNetworkInstance.
    */
  def instantiateSolNetworkInstance(): Request[InstantiateSolNetworkInstanceOutput, AWSError] = js.native
  def instantiateSolNetworkInstance(callback: js.Function2[/* err */ AWSError, /* data */ InstantiateSolNetworkInstanceOutput, Unit]): Request[InstantiateSolNetworkInstanceOutput, AWSError] = js.native
  /**
    * Instantiates a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. Before you can instantiate a network instance, you have to create a network instance. For more information, see CreateSolNetworkInstance.
    */
  def instantiateSolNetworkInstance(params: InstantiateSolNetworkInstanceInput): Request[InstantiateSolNetworkInstanceOutput, AWSError] = js.native
  def instantiateSolNetworkInstance(
    params: InstantiateSolNetworkInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ InstantiateSolNetworkInstanceOutput, Unit]
  ): Request[InstantiateSolNetworkInstanceOutput, AWSError] = js.native
  
  /**
    * Lists network function instances. A network function instance is a function in a function package .
    */
  def listSolFunctionInstances(): Request[ListSolFunctionInstancesOutput, AWSError] = js.native
  def listSolFunctionInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListSolFunctionInstancesOutput, Unit]): Request[ListSolFunctionInstancesOutput, AWSError] = js.native
  /**
    * Lists network function instances. A network function instance is a function in a function package .
    */
  def listSolFunctionInstances(params: ListSolFunctionInstancesInput): Request[ListSolFunctionInstancesOutput, AWSError] = js.native
  def listSolFunctionInstances(
    params: ListSolFunctionInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolFunctionInstancesOutput, Unit]
  ): Request[ListSolFunctionInstancesOutput, AWSError] = js.native
  
  /**
    * Lists information about function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def listSolFunctionPackages(): Request[ListSolFunctionPackagesOutput, AWSError] = js.native
  def listSolFunctionPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListSolFunctionPackagesOutput, Unit]): Request[ListSolFunctionPackagesOutput, AWSError] = js.native
  /**
    * Lists information about function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def listSolFunctionPackages(params: ListSolFunctionPackagesInput): Request[ListSolFunctionPackagesOutput, AWSError] = js.native
  def listSolFunctionPackages(
    params: ListSolFunctionPackagesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolFunctionPackagesOutput, Unit]
  ): Request[ListSolFunctionPackagesOutput, AWSError] = js.native
  
  /**
    * Lists your network instances. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed.
    */
  def listSolNetworkInstances(): Request[ListSolNetworkInstancesOutput, AWSError] = js.native
  def listSolNetworkInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListSolNetworkInstancesOutput, Unit]): Request[ListSolNetworkInstancesOutput, AWSError] = js.native
  /**
    * Lists your network instances. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed.
    */
  def listSolNetworkInstances(params: ListSolNetworkInstancesInput): Request[ListSolNetworkInstancesOutput, AWSError] = js.native
  def listSolNetworkInstances(
    params: ListSolNetworkInstancesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolNetworkInstancesOutput, Unit]
  ): Request[ListSolNetworkInstancesOutput, AWSError] = js.native
  
  /**
    * Lists details for a network operation, including when the operation started and the status of the operation. A network operation is any operation that is done to your network, such as network instance instantiation or termination.
    */
  def listSolNetworkOperations(): Request[ListSolNetworkOperationsOutput, AWSError] = js.native
  def listSolNetworkOperations(callback: js.Function2[/* err */ AWSError, /* data */ ListSolNetworkOperationsOutput, Unit]): Request[ListSolNetworkOperationsOutput, AWSError] = js.native
  /**
    * Lists details for a network operation, including when the operation started and the status of the operation. A network operation is any operation that is done to your network, such as network instance instantiation or termination.
    */
  def listSolNetworkOperations(params: ListSolNetworkOperationsInput): Request[ListSolNetworkOperationsOutput, AWSError] = js.native
  def listSolNetworkOperations(
    params: ListSolNetworkOperationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolNetworkOperationsOutput, Unit]
  ): Request[ListSolNetworkOperationsOutput, AWSError] = js.native
  
  /**
    * Lists network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def listSolNetworkPackages(): Request[ListSolNetworkPackagesOutput, AWSError] = js.native
  def listSolNetworkPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListSolNetworkPackagesOutput, Unit]): Request[ListSolNetworkPackagesOutput, AWSError] = js.native
  /**
    * Lists network packages. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def listSolNetworkPackages(params: ListSolNetworkPackagesInput): Request[ListSolNetworkPackagesOutput, AWSError] = js.native
  def listSolNetworkPackages(
    params: ListSolNetworkPackagesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolNetworkPackagesOutput, Unit]
  ): Request[ListSolNetworkPackagesOutput, AWSError] = js.native
  
  /**
    * Lists tags for AWS TNB resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists tags for AWS TNB resources.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Uploads the contents of a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def putSolFunctionPackageContent(): Request[PutSolFunctionPackageContentOutput, AWSError] = js.native
  def putSolFunctionPackageContent(callback: js.Function2[/* err */ AWSError, /* data */ PutSolFunctionPackageContentOutput, Unit]): Request[PutSolFunctionPackageContentOutput, AWSError] = js.native
  /**
    * Uploads the contents of a function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def putSolFunctionPackageContent(params: PutSolFunctionPackageContentInput): Request[PutSolFunctionPackageContentOutput, AWSError] = js.native
  def putSolFunctionPackageContent(
    params: PutSolFunctionPackageContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSolFunctionPackageContentOutput, Unit]
  ): Request[PutSolFunctionPackageContentOutput, AWSError] = js.native
  
  /**
    * Uploads the contents of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def putSolNetworkPackageContent(): Request[PutSolNetworkPackageContentOutput, AWSError] = js.native
  def putSolNetworkPackageContent(callback: js.Function2[/* err */ AWSError, /* data */ PutSolNetworkPackageContentOutput, Unit]): Request[PutSolNetworkPackageContentOutput, AWSError] = js.native
  /**
    * Uploads the contents of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def putSolNetworkPackageContent(params: PutSolNetworkPackageContentInput): Request[PutSolNetworkPackageContentOutput, AWSError] = js.native
  def putSolNetworkPackageContent(
    params: PutSolNetworkPackageContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSolNetworkPackageContentOutput, Unit]
  ): Request[PutSolNetworkPackageContentOutput, AWSError] = js.native
  
  /**
    * Tags an AWS TNB resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Tags an AWS TNB resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Terminates a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. You must terminate a network instance before you can delete it.
    */
  def terminateSolNetworkInstance(): Request[TerminateSolNetworkInstanceOutput, AWSError] = js.native
  def terminateSolNetworkInstance(callback: js.Function2[/* err */ AWSError, /* data */ TerminateSolNetworkInstanceOutput, Unit]): Request[TerminateSolNetworkInstanceOutput, AWSError] = js.native
  /**
    * Terminates a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed. You must terminate a network instance before you can delete it.
    */
  def terminateSolNetworkInstance(params: TerminateSolNetworkInstanceInput): Request[TerminateSolNetworkInstanceOutput, AWSError] = js.native
  def terminateSolNetworkInstance(
    params: TerminateSolNetworkInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateSolNetworkInstanceOutput, Unit]
  ): Request[TerminateSolNetworkInstanceOutput, AWSError] = js.native
  
  /**
    * Untags an AWS TNB resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Untags an AWS TNB resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Updates the operational state of function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def updateSolFunctionPackage(): Request[UpdateSolFunctionPackageOutput, AWSError] = js.native
  def updateSolFunctionPackage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSolFunctionPackageOutput, Unit]): Request[UpdateSolFunctionPackageOutput, AWSError] = js.native
  /**
    * Updates the operational state of function package. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def updateSolFunctionPackage(params: UpdateSolFunctionPackageInput): Request[UpdateSolFunctionPackageOutput, AWSError] = js.native
  def updateSolFunctionPackage(
    params: UpdateSolFunctionPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSolFunctionPackageOutput, Unit]
  ): Request[UpdateSolFunctionPackageOutput, AWSError] = js.native
  
  /**
    * Update a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed.
    */
  def updateSolNetworkInstance(): Request[UpdateSolNetworkInstanceOutput, AWSError] = js.native
  def updateSolNetworkInstance(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSolNetworkInstanceOutput, Unit]): Request[UpdateSolNetworkInstanceOutput, AWSError] = js.native
  /**
    * Update a network instance. A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which life-cycle operations (like terminate, update, and delete) can be performed.
    */
  def updateSolNetworkInstance(params: UpdateSolNetworkInstanceInput): Request[UpdateSolNetworkInstanceOutput, AWSError] = js.native
  def updateSolNetworkInstance(
    params: UpdateSolNetworkInstanceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSolNetworkInstanceOutput, Unit]
  ): Request[UpdateSolNetworkInstanceOutput, AWSError] = js.native
  
  /**
    * Updates the operational state of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on. A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network functions on.
    */
  def updateSolNetworkPackage(): Request[UpdateSolNetworkPackageOutput, AWSError] = js.native
  def updateSolNetworkPackage(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSolNetworkPackageOutput, Unit]): Request[UpdateSolNetworkPackageOutput, AWSError] = js.native
  /**
    * Updates the operational state of a network package. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on. A network service descriptor is a .yaml file in a network package that uses the TOSCA standard to describe the network functions you want to deploy and the Amazon Web Services infrastructure you want to deploy the network functions on.
    */
  def updateSolNetworkPackage(params: UpdateSolNetworkPackageInput): Request[UpdateSolNetworkPackageOutput, AWSError] = js.native
  def updateSolNetworkPackage(
    params: UpdateSolNetworkPackageInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSolNetworkPackageOutput, Unit]
  ): Request[UpdateSolNetworkPackageOutput, AWSError] = js.native
  
  /**
    * Validates function package content. This can be used as a dry run before uploading function package content with PutSolFunctionPackageContent. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def validateSolFunctionPackageContent(): Request[ValidateSolFunctionPackageContentOutput, AWSError] = js.native
  def validateSolFunctionPackageContent(
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateSolFunctionPackageContentOutput, Unit]
  ): Request[ValidateSolFunctionPackageContentOutput, AWSError] = js.native
  /**
    * Validates function package content. This can be used as a dry run before uploading function package content with PutSolFunctionPackageContent. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a network function (an ETSI standard telecommunication application) and function package descriptor that uses the TOSCA standard to describe how the network functions should run on your network.
    */
  def validateSolFunctionPackageContent(params: ValidateSolFunctionPackageContentInput): Request[ValidateSolFunctionPackageContentOutput, AWSError] = js.native
  def validateSolFunctionPackageContent(
    params: ValidateSolFunctionPackageContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateSolFunctionPackageContentOutput, Unit]
  ): Request[ValidateSolFunctionPackageContentOutput, AWSError] = js.native
  
  /**
    * Validates network package content. This can be used as a dry run before uploading network package content with PutSolNetworkPackageContent. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def validateSolNetworkPackageContent(): Request[ValidateSolNetworkPackageContentOutput, AWSError] = js.native
  def validateSolNetworkPackageContent(
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateSolNetworkPackageContentOutput, Unit]
  ): Request[ValidateSolNetworkPackageContentOutput, AWSError] = js.native
  /**
    * Validates network package content. This can be used as a dry run before uploading network package content with PutSolNetworkPackageContent. A network package is a .zip file in CSAR (Cloud Service Archive) format defines the function packages you want to deploy and the Amazon Web Services infrastructure you want to deploy them on.
    */
  def validateSolNetworkPackageContent(params: ValidateSolNetworkPackageContentInput): Request[ValidateSolNetworkPackageContentOutput, AWSError] = js.native
  def validateSolNetworkPackageContent(
    params: ValidateSolNetworkPackageContentInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ValidateSolNetworkPackageContentOutput, Unit]
  ): Request[ValidateSolNetworkPackageContentOutput, AWSError] = js.native
}
